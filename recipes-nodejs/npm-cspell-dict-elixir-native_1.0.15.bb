SUMMARY = "NPM: cspell-dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/elixir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed3e5a0b776a9ac83bcddfdaa33984b3"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-elixir/-/cspell-dict-elixir-1.0.15.tgz"
SRC_URI[md5sum] = "deaba97aae0be59fb36c661e76af5a33"
SRC_URI[sha256sum] = "0651409c0ffaf2e315cd4ce93450baaf49176cafaa0e911b7a274db99f561158"

NPM_PKGNAME = "cspell-dict-elixir"

inherit npmhelper
inherit native
