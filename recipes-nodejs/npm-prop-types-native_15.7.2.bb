SUMMARY = "NPM: prop-types"
DESCRIPTION = "Runtime type checking for React props and similar objects."
HOMEPAGE = "https://facebook.github.io/react/"

DEPENDS = "npm-loose-envify-native npm-object-assign-native npm-react-is-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94f0d486b3ba1dd568004dc5cccd32bc"

SRC_URI = "https://registry.npmjs.org/prop-types/-/prop-types-15.7.2.tgz"
SRC_URI[md5sum] = "a1c19eb81723330c6759daafb06e83a8"
SRC_URI[sha256sum] = "f7904f9e8bfc54965b7fc717ba718ed9dbf6beb88303d896de0a7a9b329b8375"

NPM_PKGNAME = "prop-types"

inherit npmhelper
inherit native
