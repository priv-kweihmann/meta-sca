SUMMARY = "NPM: import-modules"
DESCRIPTION = "Import all modules in a directory"
HOMEPAGE = "https://github.com/sindresorhus/import-files#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/import-modules/-/import-modules-2.1.0.tgz"
SRC_URI[md5sum] = "6b8583df4d52c8badb3b28b7bc8bdde4"
SRC_URI[sha256sum] = "4f7f6179afcd6f579c2d3f04bb572b3a5da267cf0b82787b3d308ad128192fc7"

NPM_PKGNAME = "import-modules"

inherit npmhelper
inherit native
