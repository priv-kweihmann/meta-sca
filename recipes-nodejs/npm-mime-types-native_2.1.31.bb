SUMMARY = "NPM: mime-types"
DESCRIPTION = "The ultimate javascript content-type utility."
HOMEPAGE = "https://github.com/jshttp/mime-types#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de"

DEPENDS = "npm-mime-db-native"

SRC_URI = "https://registry.npmjs.org/mime-types/-/mime-types-2.1.31.tgz"
SRC_URI[md5sum] = "6cdb136892f2899167ccd90dd74976b6"
SRC_URI[sha256sum] = "50005d9a89efbb7c2ae5a0af971f93e73aa144c2d90b1ef298258d10f58b995e"

NPM_PKGNAME = "mime-types"

inherit npmhelper
inherit native
