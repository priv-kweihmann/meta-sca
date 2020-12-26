SUMMARY = "NPM: cspell-dict-java"
DESCRIPTION = "Java dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/java#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-java/-/cspell-dict-java-1.1.1.tgz"
SRC_URI[md5sum] = "083bd1dc2c3a8ab3c85655203e54aeae"
SRC_URI[sha256sum] = "59b198f62e8abde7befe7641655696b91bbaeaf9bfc468faf34cbf3c5dbf815c"

NPM_PKGNAME = "cspell-dict-java"

inherit npmhelper
inherit native
