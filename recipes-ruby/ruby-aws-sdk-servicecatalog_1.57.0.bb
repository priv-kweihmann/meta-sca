SUMMARY = "RubyGem: aws-sdk-servicecatalog"
DESCRIPTION = "Official AWS Ruby gem for AWS Service Catalog"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "dc9165b050674c67a5d3a307e88da43e"
SRC_URI[sha256sum] = "8d25f90feffb4e9c700ab8fc489a13c0475956bc54f4eb9bc6d47feed9038eab"

GEM_NAME = "aws-sdk-servicecatalog"

inherit rubygems
