SUMMARY = "NPM: cspell-dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/elixir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed3e5a0b776a9ac83bcddfdaa33984b3"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-elixir/-/cspell-dict-elixir-1.0.14.tgz"
SRC_URI[md5sum] = "3d0184fe3e607be1740c95f1b831e86a"
SRC_URI[sha256sum] = "a6daf7bf32e0700925a6791cc7ae2cd50584ec15efbeb6a30cf2869b4a3b408e"

NPM_PKGNAME = "cspell-dict-elixir"

inherit npmhelper
inherit native
