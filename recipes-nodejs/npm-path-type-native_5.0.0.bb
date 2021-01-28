SUMMARY = "NPM: path-type"
DESCRIPTION = "Check if a path is a file, directory, or symlink"
HOMEPAGE = "https://github.com/sindresorhus/path-type#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/path-type/-/path-type-5.0.0.tgz"
SRC_URI[md5sum] = "3a343cf3c5ce9bacf63d573e34798166"
SRC_URI[sha256sum] = "a03d28ad5b2509816b055b6ec6b415b4c6b4148138d0bf243df147e32d5b1b50"

NPM_PKGNAME = "path-type"

inherit npmhelper
inherit native
