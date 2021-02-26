SUMMARY = "RubyGem: aws-sdk-elasticsearchservice"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elasticsearch Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "f61857cc9d9c95e6daeba67c2c8d69ce"
SRC_URI[sha256sum] = "0be9f1f7a54e0c5ad85cc884c98ffd48ae191d6388fe42b12c2d1928ab7fd9d4"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
