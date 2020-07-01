SUMMARY = "NPM: eslint-plugin-eslint-plugin"
DESCRIPTION = "An ESLint plugin for linting ESLint plugins"
HOMEPAGE = "https://github.com/not-an-aardvark/eslint-plugin-eslint-plugin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0fe5948ec40e15deaf5c01bc0da29119"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-eslint-plugin/-/eslint-plugin-eslint-plugin-2.3.0.tgz"
SRC_URI[md5sum] = "d9c0b03525f603a2a6e9b8432c765322"
SRC_URI[sha256sum] = "8347c572cd6d339bce634360ba6691dcd1e99dd1812a92a77806841d14ec8848"

NPM_PKGNAME = "eslint-plugin-eslint-plugin"

inherit npmhelper
inherit native
