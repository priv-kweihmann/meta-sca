SUMMARY = "NPM: is-path-inside"
DESCRIPTION = "Check if a path is inside another path"
HOMEPAGE = "https://github.com/sindresorhus/is-path-inside#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-path-inside/-/is-path-inside-4.0.0.tgz"
SRC_URI[md5sum] = "b47a2e969fc93538fee8c96601ba24d1"
SRC_URI[sha256sum] = "e420f717f4c70b0b1388807fb642cef27720aefbcfb7daf6d7aa9b86a1a89897"

NPM_PKGNAME = "is-path-inside"

inherit npmhelper
inherit native
