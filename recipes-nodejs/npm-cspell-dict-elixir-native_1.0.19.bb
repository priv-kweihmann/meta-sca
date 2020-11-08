SUMMARY = "NPM: cspell-dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/elixir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed3e5a0b776a9ac83bcddfdaa33984b3"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-elixir/-/cspell-dict-elixir-1.0.19.tgz"
SRC_URI[md5sum] = "ecd69a5f76251bba96b478b048ab52fe"
SRC_URI[sha256sum] = "fef6fe960dc4060fb9f8f8111c3a5e79173ec97f98c321f241c48fe42b5263a9"

NPM_PKGNAME = "cspell-dict-elixir"

inherit npmhelper
inherit native
