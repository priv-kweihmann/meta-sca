SUMMARY = "NPM: walkdir"
DESCRIPTION = "Find files simply. Walks a directory tree emitting events based on what it finds. Presents a familiar callback/emitter/a+sync interface. Walk a tree of any depth."
HOMEPAGE = "http://github.com/soldair/node-walkdir"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=44de1052ef10be60e4295c84f014589a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/walkdir/-/walkdir-0.4.1.tgz"
SRC_URI[md5sum] = "60646b294bc9c2ad7546853dde736cd1"
SRC_URI[sha256sum] = "1478ef2ab9cb5a70647694e01474cee13339c7765fc865086cefbc7fe40d562a"

NPM_PKGNAME = "walkdir"

inherit npmhelper
inherit native
