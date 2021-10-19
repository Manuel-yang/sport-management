<template>
  <div class="home">
    <img @click="click" alt="Vue logo" src="../assets/logo.png" />
    <h1>{{word}}</h1>
  </div>
</template>

<script>
import axios from "axios";
// @ is an alias to /src

export default {
  name: "Home",
  data(){
    return {
      word: '',
    }
  },
  methods: {
    click() {
      axios.get( "http://localhost:8080/test" ).then((res) => {
          this.word = res.data;
          console.log(res.data);
        }).catch((err) => {
          console.log(err);
        });
    },
  },
};
</script>
