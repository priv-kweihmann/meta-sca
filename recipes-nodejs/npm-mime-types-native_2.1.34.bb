SUMMARY = "NPM: mime-types"
DESCRIPTION = "The ultimate javascript content-type utility."
HOMEPAGE = "https://github.com/jshttp/mime-types#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de"

DEPENDS = "npm-mime-db-native"

SRC_URI = "https://registry.npmjs.org/mime-types/-/mime-types-2.1.34.tgz"
SRC_URI[md5sum] = "a52fc86b21762c7c0eb4a9bb111b65ba"
SRC_URI[sha256sum] = "665a66651d0e705ca7b32201cf64cbf24c272725cb77894721e6cb0cf9f82cde"

NPM_PKGNAME = "mime-types"

inherit npmhelper
inherit native
