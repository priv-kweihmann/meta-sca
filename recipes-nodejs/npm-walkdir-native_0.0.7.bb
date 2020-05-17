SUMMARY = "NPM: walkdir"
DESCRIPTION = "Find files simply. Walks a directory tree emitting events based on what it finds. Presents a familliar callback/emitter/a+sync interface. Walk a tree of any depth."
HOMEPAGE = "http://github.com/soldair/node-walkdir"

LICENSE = "MIT & X11"
LIC_FILES_CHKSUM = "file://license;md5=44de1052ef10be60e4295c84f014589a"

SRC_URI = "https://registry.npmjs.org/walkdir/-/walkdir-0.0.7.tgz"
SRC_URI[md5sum] = "27c5a716d97cd01173280bdbaf5308db"
SRC_URI[sha256sum] = "87fbbc78a49f829a05f0a29b7e4939a6bfce9c363b059aea7fd3a37621ea3029"

NPM_PKGNAME = "walkdir"

inherit npmhelper
inherit native
