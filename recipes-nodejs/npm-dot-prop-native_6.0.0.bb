SUMMARY = "NPM: dot-prop"
DESCRIPTION = "Get, set, or delete a property from a nested object using a dot path"
HOMEPAGE = "https://github.com/sindresorhus/dot-prop#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-is-obj-native"

SRC_URI = "https://registry.npmjs.org/dot-prop/-/dot-prop-6.0.0.tgz"
SRC_URI[md5sum] = "ab4dec89d0efc6ac54b485ba37701ad2"
SRC_URI[sha256sum] = "b00acb484ef2cba2933a6240dbd830bdce50a7348ab0fb9f06742ce79ee7fa04"

NPM_PKGNAME = "dot-prop"

inherit npmhelper
inherit native
