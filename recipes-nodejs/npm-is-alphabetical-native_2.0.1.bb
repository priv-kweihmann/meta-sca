SUMMARY = "NPM: is-alphabetical"
DESCRIPTION = "Check if a character is alphabetical"
HOMEPAGE = "https://github.com/wooorm/is-alphabetical#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-alphabetical/-/is-alphabetical-2.0.1.tgz"
SRC_URI[md5sum] = "e7bd40d573a2219d4e8645315f5dd489"
SRC_URI[sha256sum] = "85dddfd165e6ac37b3229c3b1c181b92d1fdde68fd5a46acf8b14696c9729f81"

NPM_PKGNAME = "is-alphabetical"

inherit npmhelper
inherit native
