SUMMARY = "NPM: cspell-dict-java"
DESCRIPTION = "Java dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/java#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-java/-/cspell-dict-java-1.0.21.tgz"
SRC_URI[md5sum] = "8beb26c32413070ce935073bca8d63a1"
SRC_URI[sha256sum] = "03b725809aa54e431dcddf4db34c1d8b788ce48f017ae33cce1f10d8e251ec1b"

NPM_PKGNAME = "cspell-dict-java"

inherit npmhelper
inherit native
