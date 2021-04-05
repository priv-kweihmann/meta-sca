SUMMARY = "NPM: mime-types"
DESCRIPTION = "The ultimate javascript content-type utility."
HOMEPAGE = "https://github.com/jshttp/mime-types#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de"

DEPENDS = "npm-mime-db-native"

SRC_URI = "https://registry.npmjs.org/mime-types/-/mime-types-2.1.30.tgz"
SRC_URI[md5sum] = "de609593c3fbaac16b9066c1f94234ea"
SRC_URI[sha256sum] = "c976f62a7ae9905e707da15077928eaea4da01db08c8e88b74e379ba55e7a7a0"

NPM_PKGNAME = "mime-types"

inherit npmhelper
inherit native
