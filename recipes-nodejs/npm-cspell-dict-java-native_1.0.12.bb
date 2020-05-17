SUMMARY = "NPM: cspell-dict-java"
DESCRIPTION = "Java dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/java#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-java/-/cspell-dict-java-1.0.12.tgz"
SRC_URI[md5sum] = "cfa90ddf9284d29cf0aef5c2b24afc37"
SRC_URI[sha256sum] = "cd6a74783cf6f76a01c8a9d2a37b33b9997aee92c941d4603a2f886e95aea384"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-java"

inherit npmhelper
inherit native
