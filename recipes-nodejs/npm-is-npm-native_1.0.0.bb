SUMMARY = "NPM: is-npm"
DESCRIPTION = "Check if your code is running as an npm script"
HOMEPAGE = "https://github.com/sindresorhus/is-npm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=30;md5=bf49ada488ae6b5bdbc82cb25ccb7da8"

SRC_URI = "https://registry.npmjs.org/is-npm/-/is-npm-1.0.0.tgz"
SRC_URI[md5sum] = "effb58881c1aca12da9d3a18335bdc3f"
SRC_URI[sha256sum] = "89906b3f5e7c0bdc75d22ea509870f14b8164394e9e344f8c2ea8c590e550b14"

NPM_PKGNAME = "is-npm"

inherit npmhelper
inherit native
