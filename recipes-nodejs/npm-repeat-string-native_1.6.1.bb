SUMMARY = "NPM: repeat-string"
DESCRIPTION = "Repeat the given string n times. Fastest implementation for repeating a string."
HOMEPAGE = "https://github.com/jonschlinkert/repeat-string"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fad3c8b9c04b365012f3d6821f2dda61"

SRC_URI = "https://registry.npmjs.org/repeat-string/-/repeat-string-1.6.1.tgz"
SRC_URI[md5sum] = "ed49a5a26c9110a28411da1cded28e3a"
SRC_URI[sha256sum] = "0be1cb94d6cb3c063946f502d39eb59ffe837a846951dc9d2ff1a49b8598b4fe"

NPM_PKGNAME = "repeat-string"

inherit npmhelper
inherit native
