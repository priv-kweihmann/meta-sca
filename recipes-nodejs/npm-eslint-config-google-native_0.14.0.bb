SUMMARY = "NPM: eslint-config-google"
DESCRIPTION = "ESLint shareable config for the Google style"
HOMEPAGE = "https://github.com/google/eslint-config-google#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ddd3d8507066d201ba15708d48d6b607"

SRC_URI = "https://registry.npmjs.org/eslint-config-google/-/eslint-config-google-0.14.0.tgz"
SRC_URI[md5sum] = "b6283fdd50b25c27277cf2c23f352274"
SRC_URI[sha256sum] = "40872a4bd81c024bbdd888a1792bebd4b379089cb3be38260692f444415bb419"

NPM_PKGNAME = "eslint-config-google"

inherit npmhelper
inherit native
