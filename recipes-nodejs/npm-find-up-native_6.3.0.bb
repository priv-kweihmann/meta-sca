SUMMARY = "NPM: find-up"
DESCRIPTION = "Find a file or directory by walking up parent directories"
HOMEPAGE = "https://github.com/sindresorhus/find-up#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-locate-path-native \
           npm-path-exists-native"

SRC_URI = "https://registry.npmjs.org/find-up/-/find-up-6.3.0.tgz"
SRC_URI[md5sum] = "2ffbd6aa83dab6559a41286b77278f12"
SRC_URI[sha256sum] = "876206b3e661db29c3593268111686e7dd1ef4b99a7659fccecf259cb62784d3"

NPM_PKGNAME = "find-up"

inherit npmhelper
inherit native
