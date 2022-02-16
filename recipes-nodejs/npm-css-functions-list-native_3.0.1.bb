SUMMARY = "NPM: css-functions-list"
DESCRIPTION = "List of standard and browser specific CSS functions."
HOMEPAGE = "https://github.com/niksy/css-functions-list#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=25ebb5527090c2ea2143246aa6501c37"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/css-functions-list/-/css-functions-list-3.0.1.tgz"
SRC_URI[md5sum] = "0141ba55a55abcdd6c5d876af6d475ea"
SRC_URI[sha256sum] = "ca9577730f3f1d8f0d8c8a6aba8b3af2f8754c685e114ec4cec5e4e428a90a4e"

NPM_PKGNAME = "css-functions-list"

inherit npmhelper
inherit native
