SUMMARY = "RubyGem: inifile"
DESCRIPTION = "Although made popular by Windows, INI files can be used on any system thanksto their flexibility"
HOMEPAGE = "http://rubygems.org/gems/inifile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=192;endline=215;md5=3dfb1f5e707fd0e99397a52df3642a12"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "13fa1e6c8d8dd3210b4f6787443c2e49"
SRC_URI[sha256sum] = "b103eb3655ec93cc626cf2de00950e91f7e69b8398842968e17e1815cfacbfb0"

GEM_NAME = "inifile"

inherit rubygems
