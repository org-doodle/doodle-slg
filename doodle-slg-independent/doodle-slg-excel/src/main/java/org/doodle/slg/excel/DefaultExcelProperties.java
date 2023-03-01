/*
 * Copyright (c) 2022-present Doodle. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.doodle.slg.excel;

import com.google.common.base.MoreObjects;
import org.doodle.slg.excel.bag.DefaultBagExcelProperties;
import org.doodle.slg.excel.login.DefaultLoginExcelProperties;
import org.doodle.slg.excel.mail.DefaultMailExcelProperties;
import org.doodle.slg.excel.payment.DefaultPaymentExcelProperties;
import org.doodle.slg.excel.rank.DefaultRankExcelProperties;
import org.doodle.slg.excel.role.DefaultRoleExcelProperties;
import org.doodle.slg.excel.task.DefaultTaskExcelProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = DefaultExcelProperties.PREFIX)
public class DefaultExcelProperties
    extends ExcelProperties<
        DefaultBagExcelProperties,
        DefaultLoginExcelProperties,
        DefaultMailExcelProperties,
        DefaultPaymentExcelProperties,
        DefaultRankExcelProperties,
        DefaultRoleExcelProperties,
        DefaultTaskExcelProperties> {
  public static final String PREFIX = "doodle.slg.excel";

  public DefaultExcelProperties(
      DefaultBagExcelProperties bag,
      DefaultLoginExcelProperties login,
      DefaultMailExcelProperties mail,
      DefaultPaymentExcelProperties payment,
      DefaultRankExcelProperties rank,
      DefaultRoleExcelProperties role,
      DefaultTaskExcelProperties task) {
    super(
        MoreObjects.firstNonNull(bag, new DefaultBagExcelProperties()),
        MoreObjects.firstNonNull(login, new DefaultLoginExcelProperties()),
        MoreObjects.firstNonNull(mail, new DefaultMailExcelProperties()),
        MoreObjects.firstNonNull(payment, new DefaultPaymentExcelProperties()),
        MoreObjects.firstNonNull(rank, new DefaultRankExcelProperties()),
        MoreObjects.firstNonNull(role, new DefaultRoleExcelProperties()),
        MoreObjects.firstNonNull(task, new DefaultTaskExcelProperties()));
  }
}
