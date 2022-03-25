SUMMARY = "NPM: @secretlint/secretlint-rule-basicauth"
DESCRIPTION = "A secretlint rule that check Basic Authentication."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-basicauth/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-basicauth/-/secretlint-rule-basicauth-5.1.1.tgz"
SRC_URI[md5sum] = "73b2089a580f9d6f2b3132cede49c4c8"
SRC_URI[sha256sum] = "d01305ba3bd7c8644816a7c24188640ceda850a178a09360ce77cdfb6173c001"

NPM_PKGNAME = "@secretlint/secretlint-rule-basicauth"

inherit npmhelper
inherit native
