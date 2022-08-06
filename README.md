# ALAMI 

Simple Web Automation Test Framework using Katalon Studio, with automated CI using Github Action

### Note on the Result

* Task #1 Automating Registrasi Pemberi Dana - DONE
  Menggunakan simple javascript code, untuk membuat email randomizer karena untuk email yang sudah terdaftar tidak dapat digunakan untuk mendaftar kembali.

* Task #2 Automating Verification - PASS
  Menemukan jalan buntu, karena baru support yahoo dan gmail untuk mengambil verifikasi data, akan tetapi tidak bisa diexecute jika menggunakan email yang dirandomize.

* Task #3 Automating Login Flow - DONE
 Simple user happy flow, login and then logout


### Penggunaan

A step by step guide that will tell you how to get the development environment up and running.

```
$ Make a changes on the repo
$ Action will trigger workflow on yaml file and trigger the testing 
$ Result can be seen at action tab
```

## Final Note

* Semua test baru mengcover happy flow
* Negative flow belum dibuat karena keterbatasan waktu dan kesibukan
* Tidak semua test menggunakan assertion, tapi ada beberapa contoh yang digunakan
* Terakhir, terima kasih untuk kesempatan yang diberikan #bow
