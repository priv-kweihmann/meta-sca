SUMMARY = "NPM: aws-sign2"
DESCRIPTION = "AWS signing. Originally pulled from LearnBoost/knox, maintained as vendor in request, now a standalone module."
HOMEPAGE = "https://github.com/mikeal/aws-sign#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3f8ead5440d1c311b45be065d135d90"

SRC_URI = "https://registry.npmjs.org/aws-sign2/-/aws-sign2-0.7.0.tgz"
SRC_URI[md5sum] = "afa4784ebc8d35ccd94822bdf80ce823"
SRC_URI[sha256sum] = "a8f9f4956c5951460f7298586ff35776fbabf4a686ef13bb7716c07703e07289"

S = "${WORKDIR}/package"

NPM_PKGNAME = "aws-sign2"

inherit npmhelper
inherit native
