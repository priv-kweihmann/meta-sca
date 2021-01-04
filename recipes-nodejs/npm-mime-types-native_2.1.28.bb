SUMMARY = "NPM: mime-types"
DESCRIPTION = "The ultimate javascript content-type utility."
HOMEPAGE = "https://github.com/jshttp/mime-types#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de"

DEPENDS = "npm-mime-db-native"

SRC_URI = "https://registry.npmjs.org/mime-types/-/mime-types-2.1.28.tgz"
SRC_URI[md5sum] = "42d82a2cd917479c3ea02ddf947fcc39"
SRC_URI[sha256sum] = "1ce50d273f312325ad4d795b5dce6d44e1252483307e7cf75bb5efcdba54c030"

NPM_PKGNAME = "mime-types"

inherit npmhelper
inherit native
