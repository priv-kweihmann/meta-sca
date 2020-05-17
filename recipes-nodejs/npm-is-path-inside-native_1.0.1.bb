SUMMARY = "NPM: is-path-inside"
DESCRIPTION = "Check if a path is inside another path"
HOMEPAGE = "https://github.com/sindresorhus/is-path-inside#readme"

DEPENDS = "npm-path-is-inside-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/is-path-inside/-/is-path-inside-1.0.1.tgz"
SRC_URI[md5sum] = "1776f7f0906628b7aec52ef41788f657"
SRC_URI[sha256sum] = "0ea771d8e4ea66e6df26bdde2938af36576f2e5ac377cfb938d7bcacf617db75"

NPM_PKGNAME = "is-path-inside"

inherit npmhelper
inherit native
