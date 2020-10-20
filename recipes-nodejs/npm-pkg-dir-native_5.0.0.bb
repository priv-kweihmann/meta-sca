SUMMARY = "NPM: pkg-dir"
DESCRIPTION = "Find the root directory of a Node.js project or npm package"
HOMEPAGE = "https://github.com/sindresorhus/pkg-dir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/pkg-dir/-/pkg-dir-5.0.0.tgz"
SRC_URI[md5sum] = "09abd438503e0dfb4182e9baf92496b4"
SRC_URI[sha256sum] = "c31b7621183275aafb2da3d6a848be2a6c23f7c3e305dffd386ba9367889c912"

NPM_PKGNAME = "pkg-dir"

inherit npmhelper
inherit native
