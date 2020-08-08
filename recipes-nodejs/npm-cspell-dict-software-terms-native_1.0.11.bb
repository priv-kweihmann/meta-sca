SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.0.11.tgz"
SRC_URI[md5sum] = "484af579a03da031c222869d04dff998"
SRC_URI[sha256sum] = "bda1c9d851e6eb6752f35125b4484c4f8857c87b9612e95624c028989b85169f"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
