SUMMARY = "NPM: is-decimal"
DESCRIPTION = "Check if a character is decimal"
HOMEPAGE = "https://github.com/wooorm/is-decimal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-decimal/-/is-decimal-2.0.0.tgz"
SRC_URI[md5sum] = "5f819e8dddb02014d4e091aab72940fd"
SRC_URI[sha256sum] = "d991452a6a883dcd97a79233d1ed05eb8ed2a239db21ff326187c63fbc760679"

NPM_PKGNAME = "is-decimal"

inherit npmhelper
inherit native
