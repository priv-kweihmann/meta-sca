SUMMARY = "NPM: cspell-dict-java"
DESCRIPTION = "Java dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/java#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-java/-/cspell-dict-java-1.0.18.tgz"
SRC_URI[md5sum] = "63ddb5e1bb140047ff3a9106c65d6948"
SRC_URI[sha256sum] = "9e4fd7f4a5468020952fe6ad77d8a6356e8644d00af6ad8b82d348b4b4a1fa96"

NPM_PKGNAME = "cspell-dict-java"

inherit npmhelper
inherit native
