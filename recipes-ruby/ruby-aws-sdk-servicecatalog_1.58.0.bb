SUMMARY = "RubyGem: aws-sdk-servicecatalog"
DESCRIPTION = "Official AWS Ruby gem for AWS Service Catalog"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8e9fc3e5e8994c82f1b439cf8dfe16e5"
SRC_URI[sha256sum] = "93f2795b0e66d1e905feef0024d3353b1e27985f0da91cc8cd08781b00e6a638"

GEM_NAME = "aws-sdk-servicecatalog"

inherit rubygems
