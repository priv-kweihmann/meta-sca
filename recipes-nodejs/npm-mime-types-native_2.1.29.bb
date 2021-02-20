SUMMARY = "NPM: mime-types"
DESCRIPTION = "The ultimate javascript content-type utility."
HOMEPAGE = "https://github.com/jshttp/mime-types#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de"

DEPENDS = "npm-mime-db-native"

SRC_URI = "https://registry.npmjs.org/mime-types/-/mime-types-2.1.29.tgz"
SRC_URI[md5sum] = "8811daee2a2b9bfc5e0038af87421072"
SRC_URI[sha256sum] = "41d642278dac884cc64c633b54b75d9d632389d7a20c7971fb09b25bd5cf22e9"

NPM_PKGNAME = "mime-types"

inherit npmhelper
inherit native
