SUMMARY = "NPM: mime-types"
DESCRIPTION = "The ultimate javascript content-type utility."
HOMEPAGE = "https://github.com/jshttp/mime-types#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de"

DEPENDS = "npm-mime-db-native"

SRC_URI = "https://registry.npmjs.org/mime-types/-/mime-types-2.1.33.tgz"
SRC_URI[md5sum] = "6bea5e67232ff7c6a18d5c5e1d6b5e72"
SRC_URI[sha256sum] = "9cd4a7a9618e0e46d3d02aeccb932b1ab71a4bcaa7f8fc36a2a6654fe3e9635f"

NPM_PKGNAME = "mime-types"

inherit npmhelper
inherit native
