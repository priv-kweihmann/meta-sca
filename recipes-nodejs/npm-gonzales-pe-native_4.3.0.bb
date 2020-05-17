SUMMARY = "NPM: gonzales-pe"
DESCRIPTION = "Gonzales Preprocessor Edition (fast CSS parser)"
HOMEPAGE = "http://github.com/tonyganch/gonzales-pe"

DEPENDS = "npm-minimist-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=0900c8be7516e2950153aa5bec04a277"

SRC_URI = "https://registry.npmjs.org/gonzales-pe/-/gonzales-pe-4.3.0.tgz"
SRC_URI[md5sum] = "1c1844a4b002a276fc741289a29b9271"
SRC_URI[sha256sum] = "5cd494c82426745b9206fa71af3461b69ec00aadf235414abd920ca650d68b8b"

NPM_PKGNAME = "gonzales-pe"

inherit npmhelper
inherit native
