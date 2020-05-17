SUMMARY = "NPM: path-type"
DESCRIPTION = "Check if a path is a file, directory, or symlink"
HOMEPAGE = "https://github.com/sindresorhus/path-type#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/path-type/-/path-type-4.0.0.tgz"
SRC_URI[md5sum] = "f860633ae232db2347328bc7869dd0fc"
SRC_URI[sha256sum] = "c025e8f8fb15279515684a158c23eb7b8fdf36d745c910a0c87014f0f8639b97"

NPM_PKGNAME = "path-type"

inherit npmhelper
inherit native
