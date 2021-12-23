SUMMARY = "NPM: pkg-dir"
DESCRIPTION = "Find the root directory of a Node.js project or npm package"
HOMEPAGE = "https://github.com/sindresorhus/pkg-dir#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/pkg-dir/-/pkg-dir-6.0.1.tgz"
SRC_URI[md5sum] = "17f22f51f9348d6b4c512720b3a58a63"
SRC_URI[sha256sum] = "d8a8e783d539f318bce19c7f166f4f9cb3f0f4aeba585b61af10833f3d7b34fb"

NPM_PKGNAME = "pkg-dir"

inherit npmhelper
inherit native
