SUMMARY = "NPM: mime-types"
DESCRIPTION = "The ultimate javascript content-type utility."
HOMEPAGE = "https://github.com/jshttp/mime-types#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de"

DEPENDS = "npm-mime-db-native"

SRC_URI = "https://registry.npmjs.org/mime-types/-/mime-types-2.1.35.tgz"
SRC_URI[md5sum] = "e347703d37de4ed9e0084a1d26dafb5d"
SRC_URI[sha256sum] = "49734fc98906e9baaacf8034923470a4c84de72943a7c005face63360701d1c3"

NPM_PKGNAME = "mime-types"

inherit npmhelper
inherit native
