SUMMARY = "NPM: resolve-from"
DESCRIPTION = "Resolve the path of a module like `require.resolve()` but from a given path"
HOMEPAGE = "https://github.com/sindresorhus/resolve-from#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/resolve-from/-/resolve-from-5.0.0.tgz"
SRC_URI[md5sum] = "23cff3fc62d9dd916e67da9c9505603f"
SRC_URI[sha256sum] = "fdf7cffeccad13cf433fe9399b291c5437de4b43c83ea0d535294e1b3d4f25e3"

NPM_PKGNAME = "resolve-from"

inherit npmhelper
inherit native
