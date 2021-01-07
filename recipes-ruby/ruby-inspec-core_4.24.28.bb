SUMMARY = "RubyGem: inspec-core"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38becae1e765aa7075044208bbab2ea4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-chef-telemetry \
                  ruby-faraday \
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

SRC_URI[md5sum] = "4f1ec932d32fa24dae048ad647fbf9ec"
SRC_URI[sha256sum] = "42d8c8b0c2a589ada2c57ea171563c243e439da127958e0cc3571f48646f0cfd"

GEM_NAME = "inspec-core"

inherit rubygems
