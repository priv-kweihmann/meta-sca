SUMMARY = "RubyGem: winrm"
DESCRIPTION = "Ruby library for Windows Remote Management"
HOMEPAGE = "https://github.com/WinRb/WinRM"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-builder \
                  ruby-erubi \
                  ruby-gssapi \
                  ruby-gyoku \
                  ruby-httpclient \
                  ruby-logging \
                  ruby-nori \
                  ruby-rubyntlm"

SRC_URI[md5sum] = "836e1bb6fb6ebae9b87a7333db2bfce9"
SRC_URI[sha256sum] = "9bccdde2cd421640336e1a9e99b5bcbc2d49a79750617f87f2f71580b641314d"

GEM_NAME = "winrm"

inherit rubygems
