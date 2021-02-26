SUMMARY = "RubyGem: inspec-core"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38becae1e765aa7075044208bbab2ea4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-chef-telemetry \
                  ruby-faraday \
                  ruby-faraday-middleware \
                  ruby-hashie \
                  ruby-license-acceptance \
                  ruby-method-source \
                  ruby-mixlib-log \
                  ruby-multipart-post \
                  ruby-parallel \
                  ruby-parslet \
                  ruby-pry \
                  ruby-rspec \
                  ruby-rspec-its \
                  ruby-rubyzip \
                  ruby-semverse \
                  ruby-sslshake \
                  ruby-thor \
                  ruby-tomlrb \
                  ruby-train-core \
                  ruby-tty-prompt \
                  ruby-tty-table"

SRC_URI[md5sum] = "12b84a487d7d2614dab1450c94a5e1c6"
SRC_URI[sha256sum] = "94e0777d29d7387c2d496374158daaeeaa08728beecebdfa67cd6887cbf96b12"

GEM_NAME = "inspec-core"

inherit rubygems
