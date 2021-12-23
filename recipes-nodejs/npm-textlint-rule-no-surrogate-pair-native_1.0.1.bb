SUMMARY = "NPM: textlint-rule-no-surrogate-pair"
DESCRIPTION = "Detects surrogate pairs in sentences."
HOMEPAGE = "https://github.com/lostandfound/textlint-rule-no-surrogate-pair#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=49;md5=2d8f0aacddb225e30f066034c7de3059"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-surrogate-pair/-/textlint-rule-no-surrogate-pair-1.0.1.tgz"
SRC_URI[md5sum] = "7824917eaacc928b58698afb3082c665"
SRC_URI[sha256sum] = "12613fdf783174a772fe4de57db1d398cfd28959a2d8233fb65237880b296dc1"

NPM_PKGNAME = "textlint-rule-no-surrogate-pair"

inherit npmhelper
inherit native
