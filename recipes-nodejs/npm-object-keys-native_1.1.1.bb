SUMMARY = "NPM: object-keys"
DESCRIPTION = "An Object.keys replacement, in case Object.keys is not available. From https://github.com/es-shims/es5-shim"
HOMEPAGE = "https://github.com/ljharb/object-keys#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0026e638d7d5c5f2768864ce0074f8ad"

SRC_URI = "https://registry.npmjs.org/object-keys/-/object-keys-1.1.1.tgz"
SRC_URI[md5sum] = "5bff295f2e4eed10ece7c3f618b87b0e"
SRC_URI[sha256sum] = "9678d9055619767c8a134033709e88a6e0a19600f3d3f2cda40acdfd75e7f212"

NPM_PKGNAME = "object-keys"

inherit npmhelper
inherit native
