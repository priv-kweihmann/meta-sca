SUMMARY = "NPM: pinkie"
DESCRIPTION = "Itty bitty little widdle twinkie pinkie ES2015 Promise implementation"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=be72c3ad86c1c4e9578a1945b082b17d"

SRC_URI = "https://registry.npmjs.org/pinkie/-/pinkie-2.0.4.tgz"
SRC_URI[md5sum] = "41b57c993d8571d9211d5b6c1c75ba7b"
SRC_URI[sha256sum] = "79a858c25e63ade9eb3e65b2aa2a491cc9e1d2fe671c0168f9291b3ba7da3d83"

NPM_PKGNAME = "pinkie"

inherit npmhelper
inherit native
