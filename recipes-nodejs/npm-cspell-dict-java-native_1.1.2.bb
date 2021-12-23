SUMMARY = "NPM: cspell-dict-java"
DESCRIPTION = "Java dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/java#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-java/-/cspell-dict-java-1.1.2.tgz"
SRC_URI[md5sum] = "6fad5388fb42936a59fbdfc78d07cc9f"
SRC_URI[sha256sum] = "599970ad158b635574cb4c5eeed76cf0c2d6863755b856542f19b96979e7151b"

NPM_PKGNAME = "cspell-dict-java"

inherit npmhelper
inherit native
