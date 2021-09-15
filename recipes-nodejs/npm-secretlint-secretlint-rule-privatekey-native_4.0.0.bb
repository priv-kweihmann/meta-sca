SUMMARY = "NPM: @secretlint/secretlint-rule-privatekey"
DESCRIPTION = "A secretlint rule for PrivateKey."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-privatekey/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-privatekey/-/secretlint-rule-privatekey-4.0.0.tgz"
SRC_URI[md5sum] = "6b389bf1282bb1ec96b556dfcd146d24"
SRC_URI[sha256sum] = "84d9037e2628c3c9559e371b07b0444bd5996508c1635c6c4a33529a64a92a86"

NPM_PKGNAME = "@secretlint/secretlint-rule-privatekey"

inherit npmhelper
inherit native
