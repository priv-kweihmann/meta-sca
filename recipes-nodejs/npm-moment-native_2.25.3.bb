SUMMARY = "NPM: moment"
DESCRIPTION = "Parse, validate, manipulate, and display dates"
HOMEPAGE = "https://momentjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=397bb5fedab22612d8d69f1458a9321e"

SRC_URI = "https://registry.npmjs.org/moment/-/moment-2.25.3.tgz"
SRC_URI[md5sum] = "b6a8793442ef3ee1ac9753a58129293c"
SRC_URI[sha256sum] = "f7dfa2af8448563c4410841d4c565ca3ae1ad683690ee310ffb816a1267472ec"

NPM_PKGNAME = "moment"

inherit npmhelper
inherit native
