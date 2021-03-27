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

SRC_URI[md5sum] = "b0a61d4a53cc2ea32753c43aeb72f28f"
SRC_URI[sha256sum] = "5f2c1161c3d8cdc44093e831c8edec8f4e5dce03a8dd4d366dacc062a58d42b4"

GEM_NAME = "inspec-core"

inherit rubygems
